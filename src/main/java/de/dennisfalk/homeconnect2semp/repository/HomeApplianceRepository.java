/*
 * MIT License
 *
 * Copyright (c) 2021 Dennis Nikolas Falk <mail@dennisfalk.de>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.dennisfalk.homeconnect2semp.repository;

import de.dennisfalk.homeconnect2semp.model.homeConnect.HomeAppliance;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Interface for home appliance repository
 */
public interface HomeApplianceRepository extends CrudRepository<HomeAppliance, Long> {

    HomeAppliance findByName(String name);
    HomeAppliance findByHaId(String haId);
    HomeAppliance findBySempID(String sempID);
    List<HomeAppliance> findAll();
    void deleteByHaId(String haId);
}
