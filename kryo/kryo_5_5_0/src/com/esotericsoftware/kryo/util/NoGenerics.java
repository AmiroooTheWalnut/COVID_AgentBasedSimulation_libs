/* Copyright (c) 2008-2023, Nathan Sweet
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided with the distribution.
 * - Neither the name of Esoteric Software nor the names of its contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */

package com.esotericsoftware.kryo.util;

import java.lang.reflect.TypeVariable;

/** Implementation of {@link Generics} that does not store generic type arguments and actual classes for type variables. */
public final class NoGenerics implements Generics {

	public static final Generics INSTANCE = new NoGenerics();

	private NoGenerics () {
		// singleton
	}

	@Override
	public void pushGenericType (GenericType fieldType) {
	}

	@Override
	public void popGenericType () {
	}

	@Override
	public GenericType[] nextGenericTypes () {
		return null;
	}

	@Override
	public Class nextGenericClass () {
		return null;
	}

	@Override
	public int pushTypeVariables (GenericsHierarchy hierarchy, GenericType[] args) {
		return 0;
	}

	@Override
	public void popTypeVariables (int count) {
	}

	@Override
	public Class resolveTypeVariable (TypeVariable typeVariable) {
		return null;
	}

	@Override
	public int getGenericTypesSize () {
		return 0;
	}
}
