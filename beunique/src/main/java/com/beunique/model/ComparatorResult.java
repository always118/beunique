package com.beunique.model;

/**
 * 
 * 
 *         These are possible results when comparing two tweets.
 *         <ul>
 *         <li><strong>IDENTICAL</strong> - When two tweets are identical.
 *         Typical copy paste work (case independent)<br/>
 *         Tweet 1: "This is tweet example"<br/>
 *         Tweet 2: "This is tweet EXAMPLE"</li>
 *         <li><strong>ALMOST_IDENTICAL</strong> - When two tweets have words in
 *         different order, or missing some words (but same or very similar
 *         meaning). With the special algorithm, we will decide if two of tweets
 *         are ALMOST_IDENTICAL. But, even after that, users will have a final
 *         vote <br/>
 *         Tweet 1: "This is the tweet example"<br/>
 *         Tweet 2: "This is example tweet"</li>
 *         <li><strong>TRANSLATED</strong> - Tweets that are translated from one
 *         language to another</li>
 *         <li><strong>DIFFERENT</strong> - Tweets that are different, and not
 *         considered as a copy</li>
 *         <li><strong>JOKE</strong> - These tweets could be considered as an
 *         identical tweets, because they are usually just copied and pasted,
 *         but we will not consider them as identical, because from time to time
 *         new jokes popup and everyone posts them on the twitter</li>
 *         </ul>
 *         
 *         @author Bruno
 * 
 */
public enum ComparatorResult {
	IDENTICAL, ALMOST_IDENTICAL, TRANSLATED, DIFFERENT, JOKE;

}
