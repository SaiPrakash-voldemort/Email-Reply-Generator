# Email Reply Generator

This project is a full-stack web application that generates email replies in different tones using Gemini AI. It also includes a Chrome extension for seamless integration with email platforms.

## Features

*   **Tone-based Reply Generation:** Generates email replies based on user-selected tones (e.g., formal, informal, persuasive).
*   **Gemini AI Integration:** Leverages Gemini AI for high-quality, contextually appropriate email replies.
*   **User-Friendly Interface:**  A React frontend provides an intuitive interface for composing emails, selecting tones, and viewing generated responses.
*   **Chrome Extension:** A Chrome extension adds an "AI Reply" button to email platforms, enabling one-click reply generation.
*   **DOM Manipulation:** The Chrome extension extracts email content directly from the DOM for streamlined processing.
*   **RESTful API:**  A Java Spring Boot backend provides a RESTful API for communication between the frontend and backend.

## Technologies Used

*   **Backend:** Java, Spring Boot, Maven
*   **Frontend:** React, JavaScript, Axios, Material UI, Emotion, Vite
*   **AI:** Gemini AI
*   **Other:** Chrome Extension API

## Installation

### Backend

1.  Clone the repository: `git clone [backend_repository_url]` *(Replace with your actual URL)*
2.  Navigate to the backend directory: `cd Email-Writer-SB`
3.  Build the project using Maven: `mvn clean install`
4.  Run the application: `mvn spring-boot:run`

### Frontend

1.  Clone the repository: `git clone [frontend_repository_url]` *(Replace with your actual URL)*
2.  Navigate to the frontend directory: `cd email-writer-react`
3.  Install dependencies: `npm install`
4.  Start the development server: `npm run dev`

### Chrome Extension

1.  Package the extension.  *(Explain how to package your extension)*
2.  Open Chrome and go to `chrome://extensions/`.
3.  Enable "Developer mode".
4.  Click "Load unpacked".
5.  Select the directory containing your packaged extension.

## Usage

### Web Application

1.  Access the web application at `[Application URL]` *(If deployed)* or `[Localhost URL]` during development.
2.  Compose your email.
3.  Select the desired tone.
4.  Click "Generate Reply".

### Chrome Extension

1.  Open an email in your email platform.
2.  Click the "AI Reply" button next to the send button.
3.  The generated reply will appear in the reply area.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request.

## License

[License Information]
