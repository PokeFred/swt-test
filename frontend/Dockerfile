# container configuration
FROM node:23-alpine
WORKDIR /app

# build the application
COPY . ./
RUN npm install
RUN npm run build

# start the application
EXPOSE 3000
CMD ["npm", "start"]
