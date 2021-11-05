package nnk.translate2.ltd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;
import nnk.translate2.ltd.Utils.ThemeUtils;

public class AboutActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        this.finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeUtils.set_theme(this);

        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("About");
        }

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.mipmap.ic_launcher)
                .setDescription("Translate2")
                .setDescription("你所Love的，就是你的Live")

                .addGroup("找到我")
                .addGitHub("wsunsettide","Github")
                .addEmail("wsunsettide@outlook.com", "电子邮箱")
                .addWebsite("https://nnk.wsunsettide.ltd/","个人主页")
                .addWebsite("https://nnk.wsunsettide.ltd/donate.html","捐赠")

                .addGroup(getString(R.string.privacy_and_permission))

                .addItem(new Element().setTitle(getString(R.string.license)).setOnClickListener(null))

                .create();
        setContentView(aboutPage);
    }
}