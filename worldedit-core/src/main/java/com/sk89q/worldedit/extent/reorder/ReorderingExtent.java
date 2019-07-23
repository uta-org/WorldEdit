/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.extent.reorder;

import com.sk89q.worldedit.extent.Extent;
import com.sk89q.worldedit.reorder.arrange.Arranger;

/**
 * An interface for {@link Extent}s that are meant to reorder changes so
 * that they are more successful.
 *
 * <p>For example, torches in Minecraft need to be placed on a block. A smart
 * reordering implementation might place the torch after the block has
 * been placed.</p>
 *
 * @deprecated Register an {@link Arranger} instead.
 */
@Deprecated
public interface ReorderingExtent extends Extent {

}
