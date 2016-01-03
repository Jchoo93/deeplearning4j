/*
 *
 *  * Copyright 2016 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */
package org.arbiter.optimize.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class OptimizationResult<C,M,A> implements Serializable {

    private Candidate<C> candidate;
    private M result;
    private Double score;
    private int index;
    private A modelSpecificResults;

    public OptimizationResult(Candidate<C> candidate, M result, Double score, int index, A modelSpecificResults){
        this.candidate = candidate;
        this.result = result;
        this.score = score;
        this.index = index;
        this.modelSpecificResults = modelSpecificResults;
    }


}
