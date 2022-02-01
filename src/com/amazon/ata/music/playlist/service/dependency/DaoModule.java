package com.amazon.ata.music.playlist.service.dependency;

import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.Provides;

import javax.inject.Singleton;
import dagger.Module;

@Module
public class DaoModule {

    @Singleton
    @Provides
    public DynamoDBMapper dynamoDBMapper() {
        // Implementation in milestone 2

        return new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2));
    }


}