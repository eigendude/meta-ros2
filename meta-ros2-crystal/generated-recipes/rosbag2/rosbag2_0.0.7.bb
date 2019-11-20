# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_crystal
inherit ros_superflore_generated

DESCRIPTION = "ROSBag2 client library"
AUTHOR = "Karsten Knese <karsten@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosbag2"
ROS_BPN = "rosbag2"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rosbag2-storage \
    rosidl-generator-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-introspection-cpp \
    shared-queues-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rosbag2-storage \
    rosidl-generator-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-introspection-cpp \
    shared-queues-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    pluginlib \
    poco-vendor \
    rcutils \
    rosbag2-storage \
    rosidl-generator-cpp \
    rosidl-typesupport-cpp \
    rosidl-typesupport-introspection-cpp \
    shared-queues-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-lint-auto \
    ament-lint-common \
    rosbag2-test-common \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2/0.0.7-0.tar.gz
ROS_BRANCH ?= "branch=release/crystal/rosbag2"
SRC_URI = "git://github.com/ros2-gbp/rosbag2-release;${ROS_BRANCH};protocol=https"
SRCREV = "781e3be3d635e945757823233d0409e3b9c4a6ea"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosbag2', d)}"
ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
