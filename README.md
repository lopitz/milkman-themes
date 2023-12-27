# Milkman Themes

<!-- this README is based on the wonderful work by Othneil Drew at https://github.com/othneildrew/Best-README-Template -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Apache 2.0 License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#milkman">What is Milkman</a>
    </li>
    <li>
        <a href="#themes">Available Themes in this Plugin</a>
    </li>
    <li>
      Getting Started
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## Milkman - a quick recap

<a name="milkman"></a>

Milkman is a free and open source workbench for everything that comes with the request and response paradigm. It started
out as an alternative to Postman, which forces people to
sign in to their cloud offer nowadays even if you just wanted to save your requests. This makes it hard to use in a
corporate environment where request of
internal APIs might be considered a secret and must not be stored in a cloud.
However, Milkman was designed in a pretty clever and flexible manner allowing users to manage and execute GraphQL, REST,
GRPC, SQL queries, Cassandra and other queries.
Please find more information on the [Milkman homepage][milkman-homepage].

## Themes

As part of this plugin 5 new UI themes are available:

- Console Dark (back to the 80s)
- Dark Violet
- Deep Ocean (my favorite, and reason I started with this plugin)
- Dracula (dark and bloody)
- GitHub Dark

## Prerequisites

This is not the whole Milkman workbench, it's just a plugin that adds new themes. This means, you need to have Milkman
installed already.
If you don't have by now, please follow the instructions on the [Milkman homepage] first.

## Installation

Currently, there is no automatic installation for plugins available. To manually install this plugin, please find first
the installation
folder of your Milkman workbench. Typical installation locations are:

- on Windows: C:\Program Files\Milkman
- on Mac: /Applications/Milkman.app

beneath that, you will find a `plugins` folder. It is possible, that there are several sub-folders under the
installation folder, e.g. the
location for the plugins folder on MacOS is typically: `/Applications/Milkman.app/Contents/Resources/plugins`.

To install the themes plugin, download the latest release directly from [github][latest-release] and copy the jar file
to the `plugins` folder.
If you already have a previous version of the plugin installed, delete the file manually from the `plugins` folder.
Restart the Milkman workbench, go to `Settings` -> `Application` and find the `Themes` menu option (see also the
screenshots of the themes below).

### Console Dark

![][console-dark-screenshot]

### Dark Violet

![][dark-violet-screenshot]

### Deep Ocean (my favorite, and reason I started with this plugin)

![][deep-ocean-screenshot]

### Dracula (dark and bloody)

![][dracula-screenshot]

### GitHub Dark

![][github-dark-screenshot]

<!-- ROADMAP -->

## Roadmap

See the [open issues](https://github.com/lopitz/milkman-themes/issues) for a list of proposed features (and known
issues).

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to be, learn, inspire, and create. Any
contributions you make are **greatly
appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the Apache 2.0 License. See [LICENSE.md](LICENSE) for more information.


<!-- CONTACT -->

## Contact

Your Name - [@lars_opitz](https://twitter.com/lars_opitz)

Project Link: [https://github.com/lopitz/milkman-themes](https://github.com/lopitz/milkman-themes)


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/lopitz/milkman-themes.svg?style=flat-square

[contributors-url]: https://github.com/lopitz/milkman-themes/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/lopitz/milkman-themes.svg?style=flat-square

[forks-url]: https://github.com/lopitz/milkman-themes/network/members

[stars-shield]: https://img.shields.io/github/stars/lopitz/milkman-themes.svg?style=flat-square

[stars-url]: https://github.com/lopitz/milkman-themes/stargazers

[issues-shield]: https://img.shields.io/github/issues/lopitz/milkman-themes.svg?style=flat-square

[issues-url]: https://github.com/lopitz/milkman-themes/issues

[license-shield]: https://img.shields.io/github/license/lopitz/milkman-themes.svg?style=flat-square

[license-url]: https://github.com/lopitz/milkman-themes/blob/master/LICENSE.txt

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555

[linkedin-url]: https://www.linkedin.com/in/larsopitz/

[milkman-homepage]: https://github.com/warmuuh/milkman

[console-dark-screenshot]: /src/img/screenshots/console-dark.png

[dark-violet-screenshot]: /src/img/screenshots/dark-violet.png

[deep-ocean-screenshot]: /src/img/screenshots/deep-ocean.png

[dracula-screenshot]: /src/img/screenshots/dracula.png

[github-dark-screenshot]: /src/img/screenshots/github-dark.png
