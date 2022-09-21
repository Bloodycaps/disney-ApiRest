-- Table: public.characters

-- DROP TABLE IF EXISTS public.characters;

CREATE TABLE IF NOT EXISTS public.characters
(
    id_characters integer NOT NULL DEFAULT nextval('characters_id_characters_seq'::regclass),
    name character varying(45) COLLATE pg_catalog."default" NOT NULL,
    image character varying(200) COLLATE pg_catalog."default",
    age integer NOT NULL,
    weight integer NOT NULL,
    history text COLLATE pg_catalog."default",
    CONSTRAINT characters_pkey PRIMARY KEY (id_characters)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.characters
    OWNER to postgres;


-- Table: public.movies_series

-- DROP TABLE IF EXISTS public.movies_series;

CREATE TABLE IF NOT EXISTS public.movies_series
(
    id_movie_serie integer NOT NULL DEFAULT nextval('movies_series_id_movie_serie_seq'::regclass),
    title character varying(45) COLLATE pg_catalog."default" NOT NULL,
    creation_date date NOT NULL,
    rate integer NOT NULL,
    image character varying(200) COLLATE pg_catalog."default",
    CONSTRAINT movies_series_pkey PRIMARY KEY (id_movie_serie)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.movies_series
    OWNER to postgres;
	
-- Table: public.characters_movies

-- DROP TABLE IF EXISTS public.characters_movies;

CREATE TABLE IF NOT EXISTS public.characters_movies
(
    id_character integer NOT NULL,
    id_movie integer NOT NULL,
    CONSTRAINT characters_movies_pkey PRIMARY KEY (id_character, id_movie),
    CONSTRAINT "fk_CHARACTERS_MOVIES_CHARACTER1" FOREIGN KEY (id_character)
        REFERENCES public.characters (id_characters) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT "fk_CHARACTERS_MOVIES_MOVIES1" FOREIGN KEY (id_movie)
        REFERENCES public.movies_series (id_movie_serie) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.characters_movies
    OWNER to postgres;
	
-- Table: public.genres

-- DROP TABLE IF EXISTS public.genres;

CREATE TABLE IF NOT EXISTS public.genres
(
    id_genre integer NOT NULL DEFAULT nextval('genre_id_genre_seq'::regclass),
    name character varying(45) COLLATE pg_catalog."default" NOT NULL,
    image character varying(200) COLLATE pg_catalog."default",
    id_movies integer NOT NULL,
    CONSTRAINT genre_pkey PRIMARY KEY (id_genre),
    CONSTRAINT "fk_GENRE_MOVIES" FOREIGN KEY (id_genre)
        REFERENCES public.movies_series (id_movie_serie) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.genres
    OWNER to postgres;