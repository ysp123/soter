/*
 * Tencent is pleased to support the open source community by making TENCENT SOTER available.
 * Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * https://opensource.org/licenses/BSD-3-Clause
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.tencent.soter.wrapper.wrap_callback;

import com.tencent.soter.core.model.SoterPubKeyModel;

/**
 * Created by henryye on 2017/6/22.
 * The result of key generation processes
 */

@SuppressWarnings("unused")
public class SoterProcessKeyPreparationResult extends SoterProcessResultBase<SoterPubKeyModel> {

    public SoterProcessKeyPreparationResult() {
        super();
    }

    public SoterProcessKeyPreparationResult(int errCode, String errMsg) {
        super(errCode, errMsg);
    }

    public SoterProcessKeyPreparationResult(int errCode, String errMsg, SoterPubKeyModel extData) {
        super(errCode, errMsg, extData);
    }

    public SoterProcessKeyPreparationResult(int errCode) {
        super(errCode);
    }

    public SoterProcessKeyPreparationResult(int errCode, SoterPubKeyModel extData) {
        super(errCode, extData);
    }
}
