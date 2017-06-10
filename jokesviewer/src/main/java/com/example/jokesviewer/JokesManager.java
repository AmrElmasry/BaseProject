package com.example.jokesviewer;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Amr Elmasry on 10/06/17.
 */

public class JokesManager {
    public static void showJoke(Context context) {
        Intent intent = new Intent(context, JokesActivity.class);
        context.startActivity(intent);
    }
}
