import telebot

bot = telebot.TeleBot("2054787765:AAGpu8wY5HlGn8sH4UsTKYT6GmvbqD9jtg4", parse_mode=None) # You can set parse_mode by default. HTML or MARKDOWN

@bot.message_handler(commands=['start', 'help'])
def send_welcome(message):
	bot.reply_to(message, "Howdy, how are you doing?")