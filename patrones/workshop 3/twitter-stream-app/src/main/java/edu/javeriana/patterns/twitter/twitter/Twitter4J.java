//package edu.javeriana.patterns.twitter.twitter;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.inject.Singleton;
//import twitter4j.FilterQuery;
//import twitter4j.StallWarning;
//import twitter4j.Status;
//import twitter4j.StatusDeletionNotice;
//import twitter4j.StatusListener;
//import twitter4j.Twitter;
//import twitter4j.TwitterFactory;
//import twitter4j.TwitterStream;
//import twitter4j.TwitterStreamFactory;
//import twitter4j.conf.ConfigurationBuilder;
//
//@Singleton
//public class Twitter4J {
//
//    @PostConstruct
//    public void init(){
//        ConfigurationBuilder cb = new ConfigurationBuilder();
//        cb.setDebugEnabled(true)
//                .setOAuthConsumerKey("NXhLeTgxOW40SWt2bGtKWUxZcDQ6MTpjaQ")
//                .setOAuthConsumerSecret("sNYKXsp2s_w6uBPHYoO2yLHf2ncYikUNGVQkbiXzsFTaNkNL46")
//                .setOAuthAccessToken("1756711059778347008-8nQPnO4fvr9skwRjpJ8Jhi77dUT8Wx")
//                .setOAuthAccessTokenSecret("lkfsFU6VqRCWeMStWtgB8rZok51BtZx0yVcDybFdU0L43");
//        TwitterFactory tf = new TwitterFactory(cb.build());
////        Twitter twitter = tf.getInstance();
//
//        TwitterStream twitterStream = (new TwitterStreamFactory(cb.build())).getInstance();
//        StatusListener listener = new StatusListener() {
//            @Override
//            public void onStatus(Status status) {
//                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
//            }
//            @Override
//            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
//                System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
//            }
//            @Override
//            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
//                System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
//            }
//            @Override
//            public void onScrubGeo(long userId, long upToStatusId) {
//                System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
//            }
//            @Override
//            public void onStallWarning(StallWarning warning) {
//                System.out.println("Got stall warning:" + warning);
//            }
//            @Override
//            public void onException(Exception ex) {
//                ex.printStackTrace();
//            }
//        };
//        twitterStream.addListener(listener);
//        twitterStream.sample();
//
//
//        String followParam = "11348282,20536157,15670515,1719374,58561993";
//        String trackParam = "Amazon,Google,Apple";
//        String locationParam = "-122.75,36.8,-121.75,37.8,-74,40,-73,41";
//        long[] follow = new long[followParam.split(",").length];
//        for (int i = 0; i < followParam.split(",").length; i++) {
//            follow[i] = Long.parseLong(followParam.split(",")[i]);
//        }
//        String[] boundary = locationParam.split(",");
//        double[][] locations = new double[boundary.length / 2][2];
//        int k = 0;
//        for (int i = 0; i < boundary.length / 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                locations[i][j] = Double.parseDouble(boundary[k++]);
//            }
//        }
//        FilterQuery query = new FilterQuery();
//        query.follow(follow);
//        query.track(trackParam.split(","));
//        query.locations(locations);
//        twitterStream.filter(query);
//    }
//
//}
