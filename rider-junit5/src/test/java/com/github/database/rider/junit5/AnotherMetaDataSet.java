package com.github.database.rider.junit5;

import com.github.database.rider.core.api.dataset.DataSet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@DataSet(value = "expectedUser.yml", disableConstraints = true)
public @interface AnotherMetaDataSet {

}
