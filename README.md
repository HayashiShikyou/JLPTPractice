# JLPT Old Question Practice App Documentation

## Overview
The **JLPT Old Question Practice App** helps users prepare for the Japanese Language Proficiency Test (JLPT) by providing access to questions from previous years' exams. The app supports multiple levels (N5, N4, N3, N2) and offers features such as **practice mode**, **exam simulation**, **answer reviews**, and **progress tracking**.

---

## Features

### 1. **Practice Mode**
- Access old JLPT questions organized by levels (N5, N4, N3, N2).
- Practice specific sections, such as:
    - Vocabulary
    - Kanji
    - Grammar
    - Reading comprehension
    - Listening (with audio recordings).
- Multiple-choice answers with immediate feedback.

### 2. **Exam Mode**
- Simulate the real JLPT experience with a countdown timer.
- Complete a full exam or a specific section under timed conditions.

### 3. **Review Mode**
- Review completed tests to see:
    - Correct answers.
    - Detailed explanations for each question.
    - Insights on why incorrect answers were wrong.

### 4. **Customization**
- Adjust settings such as:
    - Time limits.
    - Question difficulty.
    - Focused practice on specific sections (e.g., kanji-only).

### 5. **Progress Tracker**
- Track your performance over time with:
    - Accuracy trends.
    - Areas of improvement.
    - Achievements and badges for milestones (e.g., completing levels or streaks).

---

## Installation

### **Mobile App**
#### Android:
1. Visit the **Google Play Store**.
2. Search for *“JLPT Old Question Practice”*.
3. Tap **Install**.

#### iOS:
1. Open the **App Store**.
2. Search for *“JLPT Old Question Practice”*.
3. Tap **Get**.

### **Web App**
1. Go to **[www.jlptoldquestions.com](http://www.jlptoldquestions.com)**.
2. Use all features directly through your browser.

---

## Requirements

- **Mobile:** Android or iOS.
- **Web:** A modern browser (Chrome, Firefox, Safari, Edge).
- **Backend:** Java 1.8+ for server-side functionality.

---

## User Interface

### 1. **Home Screen**
- **Practice Mode**: Quick link to practice tests.
- **Exam Mode**: Start an exam simulation.
- **Recent Activity**: Resume your last session.

### 2. **Practice Test Interface**
- **Options**: Select JLPT level and section.
- **Start Button**: Begin test with a timer.
- **Navigation**: Skip questions, return to previous ones, or finish early.
- **Answer Choices**: Multiple-choice or fill-in-the-blank answers.

### 3. **Review Screen**
- View your selected answers alongside the correct ones.
- Explanations for each question, with further study links.
- Option to retake the test.

### 4. **Progress Tracking**
- **Performance Graph**: Visualize progress over time.
- **Statistics**: Breakdowns by section and level.
- **Achievements**: Badges for streaks and milestones.

---

## API Documentation (For Developers)

### 1. **Authentication**
- `POST /auth/login`: Log in a user.
    - **Params**: `email`, `password`.
    - **Response**: `{ token, user_data }`.
- `POST /auth/register`: Register a new user.
    - **Params**: `email`, `password`, `username`.
    - **Response**: `{ token, user_data }`.

### 2. **Practice Test Retrieval**
- `GET /tests/{level}`: Get tests for a specific JLPT level.
    - **Params**: `level` (e.g., N5, N4).
    - **Response**: `{ test_id, questions[] }`.
- `GET /tests/{test_id}/questions`: Fetch questions for a test.
    - **Params**: `test_id`.
    - **Response**: `{ questions[] }`.

### 3. **Question Answering**
- `POST /test/{test_id}/answer`: Submit an answer.
    - **Params**: `question_id`, `selected_answer`.
    - **Response**: `{ correct, explanation }`.

### 4. **Progress Tracking**
- `GET /user/progress`: Retrieve user progress.
    - **Response**: `{ total_tests_completed, correct_answers, performance_stats }`.
- `POST /user/progress`: Update progress data.
    - **Params**: `test_id`, `score`.
    - **Response**: `{ updated_stats }`.

---

## FAQ

### 1. **How do I access the old JLPT questions?**
- Choose your desired JLPT level from the Practice Mode to access the questions.

### 2. **Can I use the app offline?**
- Yes, offline mode is supported for downloaded practice materials.

### 3. **How can I improve my JLPT score?**
- Regularly practice questions, review mistakes, and focus on weak areas using the Progress Tracker.

---

## Contact

- **Email**: [support@jlptoldquestions.com](mailto:support@jlptoldquestions.com)
- **Phone**: 1-800-123-4567

This documentation offers a comprehensive guide for both users and developers to maximize their experience with the JLPT Old Question Practice App. Adjust details as needed for different audiences or the app's specific functionality.
