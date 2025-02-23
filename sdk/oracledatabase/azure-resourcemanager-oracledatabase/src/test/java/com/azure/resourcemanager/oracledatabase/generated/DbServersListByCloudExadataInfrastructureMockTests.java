// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.DbServer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DbServersListByCloudExadataInfrastructureMockTests {
    @Test
    public void testListByCloudExadataInfrastructure() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"ocid\":\"embnkbw\",\"displayName\":\"vxkdivqihebwtswb\",\"compartmentId\":\"wfmdurage\",\"exadataInfrastructureId\":\"zvcjfelisdjubggb\",\"cpuCoreCount\":941272169,\"dbServerPatchingDetails\":{\"estimatedPatchDuration\":2003917859,\"patchingStatus\":\"Complete\",\"timePatchingEnded\":\"2021-11-10T07:11:50Z\",\"timePatchingStarted\":\"2021-02-28T17:22:58Z\"},\"maxMemoryInGbs\":1203431733,\"dbNodeStorageSizeInGbs\":689564177,\"vmClusterIds\":[\"cmjdmspof\",\"pv\",\"hryl\",\"iofrzgbzjedmstk\"],\"dbNodeIds\":[\"v\"],\"lifecycleDetails\":\"c\",\"lifecycleState\":\"Unavailable\",\"maxCpuCount\":2051570067,\"autonomousVmClusterIds\":[\"wfansnvpdi\",\"mik\"],\"autonomousVirtualMachineIds\":[\"bzbkiw\",\"uqn\",\"ophzfylsgcrp\",\"bcunezzceze\"],\"maxDbNodeStorageInGbs\":217220442,\"memorySizeInGbs\":945619349,\"shape\":\"lwxjwetn\",\"timeCreated\":\"2021-06-29T10:43:54Z\",\"provisioningState\":\"Succeeded\"},\"id\":\"afzvaylptrs\",\"name\":\"qwztcmwqkc\",\"type\":\"cxwaxfewz\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DbServer> response = manager.dbServers()
            .listByCloudExadataInfrastructure("wwinhehf", "pofvwb", com.azure.core.util.Context.NONE);

    }
}
