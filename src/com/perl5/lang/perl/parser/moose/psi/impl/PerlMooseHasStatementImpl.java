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

package com.perl5.lang.perl.parser.moose.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.util.PsiTreeUtil;
import com.perl5.lang.perl.parser.moose.psi.PerlMooseHasStatement;
import com.perl5.lang.perl.psi.PsiPerlAnnotation;
import com.perl5.lang.perl.psi.impl.PsiPerlStatementImpl;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by hurricup on 25.11.2015.
 */
public class PerlMooseHasStatementImpl extends PsiPerlStatementImpl implements PerlMooseHasStatement
{
	public PerlMooseHasStatementImpl(ASTNode node)
	{
		super(node);
	}

	@NotNull
	@Override
	public List<PsiPerlAnnotation> getAnnotationList()
	{
		return PsiTreeUtil.getChildrenOfTypeAsList(this, PsiPerlAnnotation.class);
	}


	@Override
	public void subtreeChanged()
	{
		super.subtreeChanged();
		for (PerlMooseAttributeImpl mooseAttribute : PsiTreeUtil.findChildrenOfType(this, PerlMooseAttributeImpl.class))
		{
			mooseAttribute.subtreeChanged();
		}
	}
}
