/*
 *   Copyright 2015 Benoit LETONDOR
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.benoitletondor.easybudgetapp.helper;

import android.support.annotation.NonNull;

import java.util.Calendar;
import java.util.Date;

/**
 * Helper to work with dates
 *
 * @author Benoit LETONDOR
 */
public class DateHelper
{
    /**
     * Remove hour, minutes, seconds and ms data from a date.
     *
     * @param date
     * @return a new cleaned date
     */
    public static Date cleanDate(@NonNull Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);

        return cal.getTime();
    }
}
