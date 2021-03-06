/*
 *   Copyright 2009-2010 Joubin Houshyar
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *    
 *   http://www.apache.org/licenses/LICENSE-2.0
 *    
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.jredis.cluster.models;

import org.jredis.cluster.support.HashAlgorithm;
import org.jredis.cluster.support.HashAlgorithmProviderTestBase;
import org.jredis.ri.cluster.model.KetamaHashProvider;

/**
 * [TODO: document me!]
 *
 * @author  joubin (alphazero@sensesay.net)
 * @date    Mar 27, 2010
 * 
 */

public class KetamaHashAlgoTest extends HashAlgorithmProviderTestBase {

	// ------------------------------------------------------------------------
	// super overrides
	// ------------------------------------------------------------------------
	
	/* (non-Javadoc) @see org.jredis.cluster.ProviderTestBase#newProviderInstance() */
	@Override
	protected HashAlgorithm newProviderInstance () {
		return new KetamaHashProvider();
	}
}
