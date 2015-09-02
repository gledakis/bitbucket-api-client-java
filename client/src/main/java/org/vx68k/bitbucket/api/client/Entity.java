/*
 * Entity
 * Copyright (C) 2015 Nishimura Software Studio
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.vx68k.bitbucket.api.client;

import javax.json.JsonObject;
import static org.vx68k.bitbucket.api.client.User.TYPE_JSON_KEY;

/**
 * Superclass of Bitbucket entities.
 * @author Kaz Nishimura
 * @since 3.0
 */
public abstract class Entity {

    /**
     * JSON key for the <code>type</code> value.
     */
    protected static final String TYPE_JSON_KEY = "type";

    /**
     * Type of this object.
     */
    private final String type;

    /**
     * Constructs this object as the type in a JSON object.
     * @param json JSON object
     */
    public Entity(JsonObject json) {
        this(json.getString(TYPE_JSON_KEY));
    }

    /**
     * Constructs this object as a specified type.
     * @param type entity type
     */
    public Entity(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}