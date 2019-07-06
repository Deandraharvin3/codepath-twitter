package com.codepath.apps.restclienttemplate;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class TwitterDetailsActivity extends AppCompatActivity {
    Context context;

    Tweet tweet;
    TextView tvUserName;
    TextView tvBody;
    ImageView ivRetweet;
    ImageView ivProfileImage;
    ImageView ivLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_details);
        tvUserName = (TextView) findViewById(R.id.tvUserName);
        tvBody = findViewById(R.id.tvBody);
        ivRetweet = findViewById(R.id.ivRetweet);
        ivLike = findViewById(R.id.ivLike);
        ivProfileImage = findViewById(R.id.ivProfileImage);
        tweet = (Tweet) Parcels.unwrap(getIntent().getParcelableExtra(Tweet.class.getSimpleName()));
        Log.d("TwitterDetailsActivity",
                String.format("Showing details for '%s'",
                        tweet.getClass()));
//        context = parent.getContext();
//        LayoutInflater inflater = LayoutInflater.from(context);
        tvUserName.setText(tweet.user.name);
        tvBody.setText(tweet.getBody());
//        Glide.with(context)
//                .load(tweet.user.profileImageUrl)
//                .into(ivProfileImage);

    }
//    @NonNull
//    @Override
//    public TweetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
//        context = parent.getContext();
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View tweetView = inflater.inflate(R.layout.item_tweet, parent, false);
//        TweetAdapter.ViewHolder viewHolder = new TwitterDetailsActivity.ViewHolder(tweetView);
//        return viewHolder;
//    }
//    @Override
//    public void onBindViewHolder(@NonNull TweetAdapter.ViewHolder holder, int position) {
//        // get the data according to position
//        //populate the views according to this data
//        holder.tvUserName.setText(tweet.user.name);
//        holder.tvBody.setText(tweet.body);
//        Glide.with(context).load(tweet.user.profileImageUrl).into(holder.ivProfileImage);
//    }
}
