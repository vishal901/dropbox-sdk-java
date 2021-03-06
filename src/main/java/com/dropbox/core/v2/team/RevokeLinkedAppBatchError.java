/* DO NOT EDIT */
/* This file was generated from team_linked_apps.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * Error returned by {@link
 * DbxTeamTeamRequests#linkedAppsRevokeLinkedAppBatch(java.util.List)}.
 */
public enum RevokeLinkedAppBatchError {
    // union RevokeLinkedAppBatchError
    /**
     * An unspecified error.
     */
    UNSPECIFIED; // *catch_all

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<RevokeLinkedAppBatchError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(RevokeLinkedAppBatchError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                default: {
                    g.writeString("unspecified");
                }
            }
        }

        @Override
        public RevokeLinkedAppBatchError deserialize(JsonParser p) throws IOException, JsonParseException {
            RevokeLinkedAppBatchError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else {
                value = RevokeLinkedAppBatchError.UNSPECIFIED;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
