/*
 * Copyright 2016 Alexandr Evstigneev
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

package com.perl5.lang.perl.parser.Class.Accessor.psi;

import com.perl5.lang.perl.parser.Class.Accessor.ClassAccessorElementTypes;
import com.perl5.lang.perl.psi.PerlSubDefinitionWitTextIdentifier;

/**
 * Created by hurricup on 21.01.2016.
 */
public interface PerlClassAccessorDeclaration extends PerlSubDefinitionWitTextIdentifier, ClassAccessorElementTypes
{
	/**
	 * Checks if current declaration should follow best practice, declare get_ and set_
	 *
	 * @return check result
	 */
	boolean followsBestPractice();

	/**
	 * Checks if current accessor readable
	 *
	 * @return check result
	 */
	boolean isAccessorReadable();

	/**
	 * Checks if current accessor writable
	 *
	 * @return check result
	 */
	boolean isAccessorWritable();
}