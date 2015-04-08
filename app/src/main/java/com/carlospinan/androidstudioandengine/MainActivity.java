package com.carlospinan.androidstudioandengine;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.WakeLockOptions;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.engine.options.resolutionpolicy.IResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;


public class MainActivity extends BaseGameActivity {

    private Camera mCamera;
    private static final float WIDTH = 1024.0f;
    private static final float HEIGHT = 768.0f;

    @Override
    public EngineOptions onCreateEngineOptions() {

        mCamera = new Camera(0, 0, WIDTH, HEIGHT);

        boolean pFullScreen = true;
        ScreenOrientation pScreenOrientation = ScreenOrientation.LANDSCAPE_FIXED;
        IResolutionPolicy pResolutionPolicy = new FillResolutionPolicy();

        EngineOptions mEngineOptions = new EngineOptions(pFullScreen, pScreenOrientation, pResolutionPolicy, mCamera);

        mEngineOptions.setWakeLockOptions(WakeLockOptions.SCREEN_ON);


        return mEngineOptions;
    }

    @Override
    public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws Exception {

    }

    @Override
    public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {

    }

    @Override
    public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws Exception {

    }
}
