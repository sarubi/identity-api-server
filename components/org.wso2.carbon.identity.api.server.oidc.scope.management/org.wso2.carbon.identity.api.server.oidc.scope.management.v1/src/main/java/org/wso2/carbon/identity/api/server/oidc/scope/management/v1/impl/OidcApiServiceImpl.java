/*
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
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

package org.wso2.carbon.identity.api.server.oidc.scope.management.v1.impl;

import org.wso2.carbon.identity.api.server.oidc.scope.management.v1.*;
import org.wso2.carbon.identity.api.server.oidc.scope.management.v1.model.*;
import java.util.List;
import javax.ws.rs.core.Response;

public class OidcApiServiceImpl implements OidcApiService {

    @Override
    public Response addScope(ScopeObject scopeObject) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response delelteScope(String id) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getScope(String id) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getScopes() {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateScope(String id, Claims claims) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }
}