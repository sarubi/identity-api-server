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

package org.wso2.carbon.identity.api.server.keystore.management.v1;

import org.wso2.carbon.identity.api.server.keystore.management.v1.*;
import org.wso2.carbon.identity.api.server.keystore.management.v1.model.*;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.wso2.carbon.identity.api.server.keystore.management.v1.model.CertificateRequest;
import org.wso2.carbon.identity.api.server.keystore.management.v1.model.CertificateResponse;
import org.wso2.carbon.identity.api.server.keystore.management.v1.model.ErrorResponse;
import java.io.File;
import javax.ws.rs.core.Response;


public interface KeystoresApiService {

      public Response deleteCertificate(String alias);

      public Response getCertificate(String alias, Boolean encodeCert);

      public Response getCertificateAliases(String filter);

      public Response getClientCertificate(String alias, Boolean encodeCert);

      public Response getClientCertificateAliases(String filter);

      public Response getPublicCertificate(Boolean encodeCert);

      public Response uploadCertificate(CertificateRequest certificateRequest);
}
