package ru.tinkoff.favouritepersons.screens

import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext
import io.github.kakaocup.kakao.text.KTextView
import ru.tinkoff.favouritepersons.R


/**
 * @author n.miroshkin
 */
class DetailsScreen(testContext: TestContext<*>) : BaseScreen(testContext) {

    val screenTitle = KTextView { withId(R.id.tw_person_screen_title) }
    val firstName = KTextView { withId(R.id.et_name) }
    val lastName = KTextView { withId(R.id.et_surname) }
    val gender = KTextView { withId(R.id.et_gender) }
    val birthday = KTextView { withId(R.id.et_birthdate) }

    fun verifyScreenOpened() {
        screenTitle.isDisplayed()
    }

    fun verifyFirstName(name: String) {
        firstName.hasText(name)
    }

    fun verifyLastName(lastName: String) {
        this.lastName.hasText(lastName)
    }

    fun verifyGender(gender: String) {
        when(gender) {
            "f" -> this.gender.hasText("Ж")
            "m" -> this.gender.hasText("М")
        }
    }

    fun verifyBirthday(birthday: String) {
        this.birthday.hasText(birthday)
    }

}
