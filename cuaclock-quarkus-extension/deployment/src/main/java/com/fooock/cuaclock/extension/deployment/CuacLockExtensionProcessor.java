package com.fooock.cuaclock.extension.deployment;

import com.fooock.cuaclock.extension.runtime.CuacLockExtensionServlet;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.undertow.deployment.ServletBuildItem;

/**
 * Library main extension processor
 */
public class CuacLockExtensionProcessor {
    private static final String FEATURE = "cuaclock-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    ServletBuildItem createServlet() {
        return ServletBuildItem.builder("cuaclock-extension", CuacLockExtensionServlet.class.getName())
                .addMapping("/cuac")
                .build();
    }
}
