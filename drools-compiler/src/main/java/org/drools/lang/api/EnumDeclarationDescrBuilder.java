/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.lang.api;


import org.drools.lang.descr.EnumDeclarationDescr;

public interface EnumDeclarationDescrBuilder extends
    AnnotatedDescrBuilder<EnumDeclarationDescrBuilder>,
    AbstractClassTypeDeclarationBuilder<EnumDeclarationDescr> {


    /**
     * Defines the type name
     *
     * @param type the type name
     *
     * @return itself
     */
    public EnumDeclarationDescrBuilder name( String type );

    /**
     * Adds an enum literal
     *
     * @param lit
     * @return
     */
    public EnumLiteralDescrBuilder newEnumLiteral( String lit );
}