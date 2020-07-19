package com.platzi.android.rickandmorty.requestmanager.di

import com.platzi.android.rickandmorty.data.RemoteCharacterDataSource
import com.platzi.android.rickandmorty.data.RemoteEpisodeDataSource
import com.platzi.android.rickandmorty.requestmanager.APIConstants.BASE_API_URL
import com.platzi.android.rickandmorty.requestmanager.CharacterRequest
import com.platzi.android.rickandmorty.requestmanager.CharacterRetrofitDataSource
import com.platzi.android.rickandmorty.requestmanager.EpisodeRequest
import com.platzi.android.rickandmorty.requestmanager.EpisodeRetrofitDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class APIModule {

    @Provides
    fun characterRequestProvider(
        @Named("baseUrl") baseUrl: String
    ) = CharacterRequest(baseUrl)

    @Provides
    @Singleton
    @Named("baseUrl")
    fun baseUrlProvider(): String = BASE_API_URL

    @Provides
    fun remoteCharacterDataSourceProvider(
        characterRequest: CharacterRequest
    ): RemoteCharacterDataSource = CharacterRetrofitDataSource(characterRequest)

    //TODO Paso 8: Crear el método para proveer la petición de episodio "EpisodeRequest"

    //TODO Paso 9: Crear el método para proveer el recurso de datos de episodio remoto "EpisodeRetrofitDataSource"
}
