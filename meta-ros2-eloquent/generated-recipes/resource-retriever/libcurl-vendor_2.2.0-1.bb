# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around libcurl, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/curl/curl"
SECTION = "devel"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "resource_retriever"
ROS_BPN = "libcurl_vendor"

ROS_BUILD_DEPENDS = " \
    curl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    pkgconfig-native \
"

ROS_EXEC_DEPENDS = " \
    curl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/resource_retriever-release/archive/release/eloquent/libcurl_vendor/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/libcurl_vendor"
SRC_URI = "git://github.com/ros2-gbp/resource_retriever-release;${ROS_BRANCH};protocol=https"
SRCREV = "3c2c391922ed144f11e2874cc28e234f07c1a07f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
