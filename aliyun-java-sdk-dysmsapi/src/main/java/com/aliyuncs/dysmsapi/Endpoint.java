/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dysmsapi;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("rus-west-1-pop", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("cn-beijing", "dysmsapi-proxy.cn-beijing.aliyuncs.com");
            put("ap-south-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("eu-west-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("eu-west-1-oxs", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("ap-northeast-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("me-east-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-3", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("eu-central-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-5", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("us-east-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("ap-northeast-2-pop", "dysmsapi.ap-southeast-1.aliyuncs.com");
            put("us-west-1", "dysmsapi.ap-southeast-1.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
