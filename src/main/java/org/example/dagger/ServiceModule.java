package org.example.dagger;

import dagger.Module;
import dagger.Provides;
import org.example.DBClient;
import org.example.Service;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class ServiceModule {

  @Named(value="region")
  String getRegion() {
    return System.getProperty("region", "us-west-1");
  }

  @Provides
  @Singleton
  DBClient getDBClient(@Named(value = "region") String region) {
    return new DBClient(region);
  }
}
