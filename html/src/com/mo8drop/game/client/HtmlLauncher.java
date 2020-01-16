package com.mo8drop.game.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.mo8drop.game.MyMO8Drop;

public class HtmlLauncher extends GwtApplication {

        // USE THIS CODE FOR A FIXED SIZE APPLICATION
        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(800, 480);
        }


        @Override
        public ApplicationListener createApplicationListener () {
                return new MyMO8Drop();
        }
}