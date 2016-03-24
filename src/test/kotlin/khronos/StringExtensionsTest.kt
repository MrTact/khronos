package khronos

import org.junit.Before
import org.junit.Test
import java.util.*

/**
 * Unit test for StringExtensions.kt.
 */
class StringExtensionsTest {

    @Before fun setup() {
        calendar.timeZone = TimeZone.getTimeZone("Asia/Tokyo")
    }

    @Test fun toDate() {
        assertEquals(
                expected = Dates.of(year = 1987, month = 6, day = 2, hour = 12, minute = 0, second = 0),
                actual = "1987-06-02".toDate("yyyy-MM-dd"))
    }

}
