package org.imozerov.streetartview;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

import org.imozerov.streetartview.storage.DataSource;
import org.imozerov.streetartview.storage.IDataSource;

import javax.inject.Singleton;

/**
 * Created by imozerov on 06.02.16.
 */
@Module
public class AppModule {
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    public IDataSource provideDataSource() {
        return new DataSource();
    }
}
