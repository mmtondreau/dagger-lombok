package org.example.dagger;

import dagger.Module;
import dagger.Provides;
import org.example.DBClient;
import org.example.Service;

import javax.inject.Singleton;

@Module
public class ServiceModule {

  @Provides
  @Singleton
  DBClient getDBClient() {
    return new DBClient("us-west-1");
  }
}
