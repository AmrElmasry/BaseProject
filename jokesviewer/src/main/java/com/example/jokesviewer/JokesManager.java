package com.example.jokesviewer;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Amr Elmasry on 10/06/17.
 */

public class JokesManager {
    public static void showJoke(Context context, JokesActivity activity) {
        Intent intent = new Intent(context, activity.getClass());
        context.startActivity(intent);
    }
}
