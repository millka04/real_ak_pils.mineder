package com.example.real_ak_pilsmineder.presentation

import com.example.real_ak_pilsmineder.presentation.screen.MyData
import dev.alejo.compose_calendar.CalendarEvent
import java.time.LocalDate

private fun getListOfEvents() = listOf(
    CalendarEvent(
        data = MyData("Event 1"),
        date = LocalDate.now()
    ),
    CalendarEvent(
        data = MyData("Event 1"),
        date = LocalDate.now().minusDays(20)
    ),
    CalendarEvent(
        data = MyData("Event 2"),
        date = LocalDate.now().minusDays(20)
    ),
    CalendarEvent(
        data = MyData("Event 1"),
        date = LocalDate.now().plusDays(1)
    ),
    CalendarEvent(
        data = MyData("Event 2"),
        date = LocalDate.now().plusDays(1)
    ),
    CalendarEvent(
        data = MyData("Event 3"),
        date = LocalDate.now().plusDays(1)
    ),
    CalendarEvent(
        data = MyData("Event 4"),
        date = LocalDate.now().plusDays(1)
    ),
    CalendarEvent(
        data = MyData("Event 3"),
        date = LocalDate.now().plusDays(4)
    ),
    CalendarEvent(
        data = MyData("Event 4"),
        date = LocalDate.now().plusDays(4)
    ),
    CalendarEvent(
        data = MyData("Event 4"),
        date = LocalDate.now().plusDays(4)
    ),
)