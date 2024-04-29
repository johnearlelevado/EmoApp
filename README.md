# EmoApp

### Requirements

1. **Language:** Kotlin
2. **Architecture:** Follow a clean architecture pattern (e.g., MVVM)
3. **Networking:** No need for real API calls, fetch and parse the local json file
4. **Persistence:** Implement a simple caching mechanism to store previously fetched data

### Notes
- I made use of MVVM clean architecture because it is easy to work on and is very much maintainable.
- The UiState is used to manage the state of the Ui.  This means that, for any changes we want in the UI, we just need to update the UiState.
- I also added Dagger Hilt to help me manage the dependencies and is easier to unit test
- I made use of a DataSource abstraction so that it is easier to swap the LocalDataSource with a NetworkDataSource in the future. This is also very helpful in unit testing the app

### Challenges
- I currently work at my current company so the time for me to work on this project is very limited

## Future enhancements
- Given more time, I can add retrofit for API calls
- I could also add loading animation like shimmering bars
- I could add more unit tests
- I could convert the UI to Jetpack Compose (after more study on this)

![Screen1](https://github.com/johnearlelevado/EmoApp/blob/3578240618dd9e5d255537e568014b4a5fb0943d/Screenshot_20240429_125631.png)

![Screen1](https://github.com/johnearlelevado/EmoApp/blob/3578240618dd9e5d255537e568014b4a5fb0943d/Screenshot_20240429_125659.png)
