package com.yj.common.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class SiteMeshFilter extends ConfigurableSiteMeshFilter{

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        //builder.addDecoratorPath("/*","/decorator/default").addExcludedPath("/static/**");
    }
}
