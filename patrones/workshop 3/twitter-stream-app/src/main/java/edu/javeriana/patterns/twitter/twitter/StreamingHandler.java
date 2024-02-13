///*
//Copyright 2020 Twitter, Inc.
//SPDX-License-Identifier: Apache-2.0
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//
//NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
//https://openapi-generator.tech
//Do not edit the class manually.
//*/
//package edu.javeriana.patterns.twitter.twitter;
//
//import com.twitter.clientlib.ApiException;
//import com.twitter.clientlib.api.TwitterApi;
//
//import java.io.InputStream;
//
//public abstract class StreamingHandler<T> {
//    protected final TwitterApi apiInstance;
//
//    public StreamingHandler(TwitterApi apiInstance) {
//        this.apiInstance = apiInstance;
//    }
//
//    public abstract InputStream connectStream() throws ApiException;
//
//    public abstract void actionOnStreamingObject(T streamingTweet) throws ApiException;
//
//    public abstract T getStreamingObject(String tweetString) throws Exception;
//
//    public abstract boolean hasReconnectErrors(T streamingTweet);
//
//    public boolean processAndVerifyStreamingObject(String tweetString) throws Exception {
//        T tweet = getStreamingObject(tweetString);
//        actionOnStreamingObject(tweet);
//        return !hasReconnectErrors(tweet);
//    }
//}