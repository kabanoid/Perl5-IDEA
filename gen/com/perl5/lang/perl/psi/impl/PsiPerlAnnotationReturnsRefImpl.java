// This is a generated file. Not intended for manual editing.
package com.perl5.lang.perl.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.perl5.lang.perl.psi.PerlNamespaceElement;
import com.perl5.lang.perl.psi.PsiPerlAnnotationReturnsRef;
import com.perl5.lang.perl.psi.PsiPerlVisitor;
import com.perl5.lang.perl.psi.utils.PerlPsiImplUtil;
import org.jetbrains.annotations.NotNull;

public class PsiPerlAnnotationReturnsRefImpl extends PsiPerlAnnotationImpl implements PsiPerlAnnotationReturnsRef
{

	public PsiPerlAnnotationReturnsRefImpl(ASTNode node)
	{
		super(node);
	}

	public void accept(@NotNull PsiElementVisitor visitor)
	{
		if (visitor instanceof PsiPerlVisitor) ((PsiPerlVisitor) visitor).visitAnnotationReturnsRef(this);
		else super.accept(visitor);
	}

	public PerlNamespaceElement getNamespaceElement()
	{
		return PerlPsiImplUtil.getNamespaceElement(this);
	}

}
