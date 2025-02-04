/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.faces.event;

/**
 * <p class="changed_added_2_0">
 * By implementing this class, an object indicates that it is a listener for one or more kinds of
 * {@link BehaviorEvent}s.
 * </p>
 *
 * @since 2.0
 */
public interface AjaxBehaviorListener extends BehaviorListener {

    /**
     * <p class="changed_added_2_0">
     * Process the Ajax behavior event.
     * </p>
     *
     * @param event the <code>AjaxBehaviorEvent</code> instance that is being processed.
     *
     * @throws AbortProcessingException if lifecycle processing should cease for this request.
     *
     * @since 2.0
     */
    void processAjaxBehavior(AjaxBehaviorEvent event) throws AbortProcessingException;
}
