FROM alpine 
EXPOSE 80
RUN apk add nginx
COPY ./ordinario-ftw /var/lib/nginx/html/
COPY ./jechua.conf /etc/nginx/http.d/default.conf
#permisos
CMD ["nginx", "-g", "daemon off;"]
#RUN nginx 
#-g 'daemon off;'