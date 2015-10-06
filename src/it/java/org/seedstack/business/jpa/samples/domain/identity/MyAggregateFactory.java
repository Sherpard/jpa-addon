/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
/**
 * 
 */
package org.seedstack.business.jpa.samples.domain.identity;

import org.seedstack.business.api.domain.GenericFactory;
import org.seedstack.business.api.domain.stereotypes.Create;

/**
 * 
 * @author redouane.loulou@ext.mpsa.com
 *
 */
@Create
public interface MyAggregateFactory  extends GenericFactory<MyAggregate> {

	
	MyAggregate createMyAggregate(String name);

}
