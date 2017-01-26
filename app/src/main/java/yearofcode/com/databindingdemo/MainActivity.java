package yearofcode.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yearofcode.com.databindingdemo.databinding.ActivityMainBinding;
import yearofcode.com.databindingdemo.models.User;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        dataBinding.setGreeting("Hello World!");

        User user = new User();
        user.setFirstName("John");
        user.setLastName("Legend");

        dataBinding.setUser(user);
    }
}
