package com.example.daggerusage

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    // name it which we use
    fun provideAdress() : Adress {
        return Adress("Maltepe/Istanbul")
    }
}