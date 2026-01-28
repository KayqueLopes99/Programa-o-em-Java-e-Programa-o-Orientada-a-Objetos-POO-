package com.kayquelopes.workshopmongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "workshop_mongoDB"; // <--- AQUI FORÇAMOS O NOME
    }

    @Override
    public MongoClient mongoClient() {
        // Conecta no localhost padrão
        return MongoClients.create("mongodb://localhost:27017");
    }
}