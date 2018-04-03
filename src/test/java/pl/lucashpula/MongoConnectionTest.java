package pl.lucashpula;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.junit.Assert;
import org.junit.Test;

public class MongoConnectionTest {

    @Test
    public void shouldConnectToMongoDb() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        ServerAddress serverAddress = mongoClient.getAddress();

        Assert.assertNotNull(serverAddress);
    }
}
