$(document).ready(function() {

	$("#originalTw").bind("keyup change input", function() {
		retrieveTweet(true);
	}).bind("ajaxSend", function() { // Binding spinner
		turnOnSpinner(true);
	}).bind("ajaxStop ajaxError", function() {
		turnOnSpinner(false);
	});

	$("#copyTw").bind("keyup change input", function() {
		retrieveTweet(false);
	}).bind("ajaxSend", function() {
		turnOnSpinner(true);
	}).bind("ajaxStop ajaxError", function() {
		turnOnSpinner(false);
	});
});

/**
 * @param originalTw -
 *            boolean, whether to pick a value from original or copy input
 */
function retrieveTweet(originalTw) {
	if (originalTw) {
		originalOrCopy = "original";
	} else {
		originalOrCopy = "copy";
	}
	inputUrl = $("#" + originalOrCopy + "Tw").val();

	$.post('retrieveTweet', {
		tweetUrl : inputUrl
	}, function(data) {

		var tweet = jQuery.parseJSON(data);
		if (data != "{}") {
			$("#" + originalOrCopy + "Tweet").text(tweet.text);
			$("#" + originalOrCopy + "AuthorImg").attr("src", tweet.img);
			$("#" + originalOrCopy + "AuthorName").text(tweet.authorName);
			$("#" + originalOrCopy + "AuthorUsername").text(
					"@" + tweet.authorUsername);
			$("#" + originalOrCopy + "Timestamp").text(tweet.timestamp);
		} else {
			// Remove all content if tweet is not found
			$("#" + originalOrCopy + "Tweet").text("Check your URL, please!");
			$("#" + originalOrCopy + "AuthorImg").attr("src", "");
			$("#" + originalOrCopy + "AuthorName").text("");
			$("#" + originalOrCopy + "AuthorUsername").text("");
			$("#" + originalOrCopy + "Timestamp").text("");

		}
	});
}

function turnOnSpinner(show) {
	if (show) {
		$("#tweetSpinner").css({
			"visibility" : "visible"
		});

	} else {
		$("#tweetSpinner").css({
			"visibility" : "hidden"
		});

	}
}
