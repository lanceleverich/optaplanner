/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.persistence.jackson.api.score;

import com.fasterxml.jackson.databind.JsonDeserializer;
import org.optaplanner.core.api.score.Score;

/**
 * Jackson binding support for a {@link Score} type.
 * <p>
 * For example: use {@code @JsonSerialize(using = ScoreJacksonJsonSerializer.class) @JsonDeserialize(using = HardSoftScoreJacksonJsonDeserializer.class)}
 * on a {@code HardSoftScore score} field and it will marshalled to JSON as {@code "score":"-999hard/-999soft"}.
 * @see Score
 * @param <Score_> the actual score type
 */
public abstract class AbstractScoreJacksonJsonDeserializer<Score_ extends Score<Score_>>
        extends JsonDeserializer<Score_> {

}
